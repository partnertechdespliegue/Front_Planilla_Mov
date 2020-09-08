package com.app.partner.plan.Fragments;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.app.partner.plan.Activities.LoginActivity;
import com.app.partner.plan.Common.Comunes;
import com.app.partner.plan.Common.SharedPreferencesManager;
import com.app.partner.plan.Model.Request.DTO.TrabajadorDTO;
import com.app.partner.plan.Model.Request.MODEL.ContratoMODEL;
import com.app.partner.plan.Model.Request.MODEL.DepartamentoMODEL;
import com.app.partner.plan.Model.Request.MODEL.DistritoMODEL;
import com.app.partner.plan.Model.Request.MODEL.EmpresaMODEL;
import com.app.partner.plan.Model.Request.MODEL.EstadoCivilMODEL;
import com.app.partner.plan.Model.Request.MODEL.HorarioMODEL;
import com.app.partner.plan.Model.Request.MODEL.NivelEduMODEL;
import com.app.partner.plan.Model.Request.MODEL.OcupacionMODEL;
import com.app.partner.plan.Model.Request.MODEL.ProvinciaMODEL;
import com.app.partner.plan.Model.Request.MODEL.SituacionMODEL;
import com.app.partner.plan.Model.Request.MODEL.TipoDocMODEL;
import com.app.partner.plan.Model.Request.MODEL.TipoZonaMODEL;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;
import com.app.partner.plan.Model.Response.ResponseTraba;
import com.app.partner.plan.Model.Response.ResponseTrabajador;
import com.app.partner.plan.R;
import com.app.partner.plan.Services.Instance.ITrabajador;
import com.app.partner.plan.Services.Service.TrabajadorInterface;
import com.sdsmdg.tastytoast.TastyToast;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.Calendar;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Part;

import static android.app.Activity.RESULT_OK;
import static com.app.partner.plan.Common.Comunes.KEY_ID_PERFIL;

public class AjusteCuentaFragment extends Fragment {

    private static TrabajadorInterface trabajadorInterface;
    private EditText editNombre, editApellidoP, editApellidoM, editEstadoC, editFechaN, editCelular, editCorreo, editDireccion;
    ImageView foto;
    Button btnCambiarFoto;
    Button btnMasculino, btnFemenino, buttonActualizar;
    Activity activity;
    ImageButton calendarButton;

    public static final int MY_PERMISSIONS_GALLERY = 1;


    Toolbar toolbar;

    String nombre, apellidoPa, apellidoMa, celular, correo, estadoC, fechaN, direccion, genero;

    TrabajadorMODEL p = SharedPreferencesManager.getTrabajadorMODEL();

    private ITrabajador iTrabajador;

    public AjusteCuentaFragment() {
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            this.activity = (Activity) context;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_ajuste_cuenta, null);
        retrofitInit();
        obtenerViews(view);
        Cambiar();
        mostarFoto();
        EditarUsuario();
        return view;
    }

    private void obtenerViews(View view){
        foto = view.findViewById(R.id.imageViewPefil);
        btnCambiarFoto = view.findViewById(R.id.btnCambiar);
        editNombre = view.findViewById(R.id.editText2);
        editApellidoP = view.findViewById(R.id.editApePater);
        editApellidoM = view.findViewById(R.id.editApeMater);
        editEstadoC = view.findViewById(R.id.editEstadoC);
        editFechaN = view.findViewById(R.id.editFechaN);
        editCelular = view.findViewById(R.id.editDistrito);
        editCorreo = view.findViewById(R.id.editText5);
        btnMasculino = view.findViewById(R.id.buttonMasculinoUser);
        btnFemenino = view.findViewById(R.id.buttonFemeninoUser);
        buttonActualizar = view.findViewById(R.id.button);
        editDireccion = view.findViewById(R.id.editDireccion);
        calendarButton = view.findViewById(R.id.calendarBtn);
        toolbar = view.findViewById(R.id.toolbarMain);
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarCalendar();
            }
        });

        btnMasculino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMale();
                genero = "M";
            }
        });

        btnFemenino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               btnFemale();
                genero = "F";
            }
        });

        buttonActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerTextoEdit();
                generoNull();
                p.setNombres(nombre);
                p.setApePater(apellidoPa);
                p.setApeMater(apellidoMa);
                p.getDistrito().setDescripcion(celular);
                p.setCorreo(correo);
                p.getEstadoCivil().setDescripcion(estadoC);
                p.setFecNac(fechaN);
                p.setDireccion(direccion);

                Call<ResponseTrabajador> call = trabajadorInterface.modificar(p);
                call.enqueue(new Callback<ResponseTrabajador>() {
                    @Override
                    public void onResponse(Call<ResponseTrabajador> call, Response<ResponseTrabajador> response) {
                        System.out.println("RESPONSE: "+response);
                        if (response.isSuccessful()) {
                            Toast tastyToast = TastyToast.makeText(getContext(), "Usuario Actualizado correctamente", TastyToast.LENGTH_SHORT, TastyToast.SUCCESS);
                            tastyToast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
                            tastyToast.show();
                            SharedPreferencesManager.setPreferences(response.body().getDefaultObj());
                            System.out.println(SharedPreferencesManager.getTrabajadorMODEL());
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseTrabajador> call, Throwable t) {
                        System.out.println("EERROORR: "+t);
                        Toast tastyToast = TastyToast.makeText(getContext(), "Ocurrio un error", TastyToast.LENGTH_SHORT, TastyToast.ERROR);
                        tastyToast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
                        tastyToast.show();

                    }
                });
            }
        });
    }

    private void generoNull(){
        if(genero == null){
            p.setSexo(p.getSexo());
        }else{
            p.setSexo(genero);
        }
    }

    private void obtenerTextoEdit(){
        nombre = editNombre.getText().toString();
        apellidoPa = editApellidoP.getText().toString();
        apellidoMa = editApellidoM.getText().toString();
        celular = editCelular.getText().toString();
        correo = editCorreo.getText().toString();
        estadoC = editEstadoC.getText().toString();
        fechaN = editFechaN.getText().toString();
        direccion = editDireccion.getText().toString();
    }

    private void mostrarCalendar() {
        final Calendar calendario = Calendar.getInstance();
        int yy = calendario.get(Calendar.YEAR);
        int mm = calendario.get(Calendar.MONTH);
        int dd = calendario.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePicker = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
                int rmonth = month + 1;
                String smonth = rmonth < 10 ? ("0" + rmonth) : "" + rmonth;
                String sday = dayOfMonth < 10 ? ("0" + dayOfMonth) : "" + dayOfMonth;
                editFechaN.setText(year + "-" + smonth + "-" + sday);
            }
        }, yy, mm, dd);
        datePicker.show();
    }

    ///////////////////////////////////////////



  /*  @Override
    public void onRequestPermissionsResult (int requestCode, String[] permissions,int[] grantResults){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        System.out.println("RESPONSEEEEEEEEEEEEE: "+requestCode);
        switch (requestCode) {
            case MY_PERMISSIONS_GALLERY:
                if (grantResults.length > 0 &&
                        grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission is granted. Continue the action or workflow
                    // in your app.
                    System.out.println("bye");
                }  else {
                   alert();
                    System.out.println("holis");
                }
                return;
        }
        // Other 'case' lines to check for other
        // permissions this app might request.
    }*/


    public void Cambiar(){
        btnCambiarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, MY_PERMISSIONS_GALLERY);
                }else{
                    cargarImagen();
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case MY_PERMISSIONS_GALLERY:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    cargarImagen();
                }else{
                    alert();
                   // Toast.makeText(getContext(), "No se aceptó permisos", Toast.LENGTH_SHORT).show();
                }
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }


    public void EditarUsuario(){

        String ape[] = SharedPreferencesManager.getTrabajadorMODEL().getFecNac().replace("T", " ").replace("  ", " ").split(" ");
        editNombre.setText(SharedPreferencesManager.getTrabajadorMODEL().getNombres());
        editCorreo.setText(SharedPreferencesManager.getTrabajadorMODEL().getCorreo());
        editCelular.setText(SharedPreferencesManager.getTrabajadorMODEL().getDistrito().getDescripcion());
        editFechaN.setText(ape[0]);
        editEstadoC.setText(SharedPreferencesManager.getTrabajadorMODEL().getEstadoCivil().getDescripcion());
        editApellidoM.setText(SharedPreferencesManager.getTrabajadorMODEL().getApeMater());
        editApellidoP.setText(SharedPreferencesManager.getTrabajadorMODEL().getApePater());
        editDireccion.setText(SharedPreferencesManager.getTrabajadorMODEL().getDireccion());

        if (SharedPreferencesManager.getTrabajadorMODEL().getSexo().equals("M")){
            btnMale();
        } else {
            btnFemale();
        }

    }

    private void permiso(){
        if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, MY_PERMISSIONS_GALLERY);
        }
    }

    private void alert(){
        new AlertDialog.Builder(getContext())
                .setTitle("Galery")
                .setMessage("Es neceario proporcionar el permiso de galeria. \n\n ¿Desea dar el permiso?")
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.out.println("BIEN");
                        permiso();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        System.out.println("MAL");
                    }
                })
                .show();
    }

    private void btnMale(){
        btnMasculino.setBackgroundResource(R.drawable.buttonleft);
        btnFemenino.setBackgroundResource(R.drawable.buttonright);
        btnMasculino.setTextColor(Color.parseColor("#FFFFFF"));
        btnFemenino.setTextColor(Color.parseColor("#000000"));
    }

    private void btnFemale(){
        btnFemenino.setBackgroundResource(R.drawable.btnredondeado);
        btnMasculino.setBackgroundResource(R.drawable.btnredondeado2);
        btnFemenino.setTextColor(Color.parseColor("#FFFFFF"));
        btnMasculino.setTextColor(Color.parseColor("#000000"));
    }

    public void cargarImagen(){
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent,"Seleccione"),10);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode== RESULT_OK){
            Uri path = data.getData();
            foto.setImageURI(path);
            getRealPathFromUri(getContext(),path);
        }
    }

    private void retrofitInit() {
        iTrabajador = ITrabajador.getInstance();
        trabajadorInterface = iTrabajador.getTrabajadorInterface();
    }

    public void mostarFoto(){
        TrabajadorMODEL trabajadorMODEL = SharedPreferencesManager.getTrabajadorMODEL();
        if(trabajadorMODEL.getFoto()!=null){
            System.out.println("FOTO: "+trabajadorMODEL.toString());
            Picasso.get().load(Comunes.URL_BACK +"api/trabajador/uploadImage/img/"+trabajadorMODEL.getFoto()).into(foto);
            System.out.println("adios");
        }
    }

    public static String getRealPathFromUri(Context context, Uri contentUri) {
        Cursor cursor = null;
        try {
            String[] proj = { MediaStore.Images.Media.DATA };
            cursor = context.getContentResolver().query(contentUri, proj, null, null, null);
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            cursor.moveToFirst();
            //final File file = new File(Environment.getExternalStorageDirectory(), "read.me");
            File photoFile = new File(cursor.getString(column_index));
            MultipartBody.Part requestImage = null;
            RequestBody requestBody = RequestBody.create(MediaType.parse("Multipart/form-data"),photoFile);
            requestImage = MultipartBody.Part.createFormData("file",photoFile.getName(),requestBody);
            SharedPreferencesManager.getPrefString(Comunes.KEY_TOKEN);
            Call<ResponseTrabajador> call = trabajadorInterface.actualizarFoto(SharedPreferencesManager.getTrabajadorMODEL().getIdTrabajador(),requestImage);
            call.enqueue(new Callback<ResponseTrabajador>() {
                @Override
                public void onResponse(Call<ResponseTrabajador> call, Response<ResponseTrabajador> response) {
                    if (response.isSuccessful()) {
                        SharedPreferencesManager.setPreferences(response.body().getDefaultObj());

                    }
                }
                @Override
                public void onFailure(Call<ResponseTrabajador> call, Throwable t) {
                    System.out.println("Error"+ t);
                }
            });
            return cursor.getString(column_index);

        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }


    }
}
