package com.app.partner.plan.Fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.app.partner.plan.Common.Comunes;
import com.app.partner.plan.Common.SharedPreferencesManager;
import com.app.partner.plan.Model.Request.MODEL.TrabajadorMODEL;
import com.app.partner.plan.Model.Response.ResponseTrabajador;
import com.app.partner.plan.R;
import com.app.partner.plan.Services.Instance.ITrabajador;
import com.app.partner.plan.Services.Service.TrabajadorInterface;
import com.squareup.picasso.Picasso;

import java.io.File;

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
    private EditText editNombre, editApellido, editCorreo;
    ImageView foto;
    Button btnCambiarFoto;
    Activity activity;


    private ITrabajador iTrabajador;
   // private TrabajadorInterface trabajadorInterface;

    public AjusteCuentaFragment() {
        // Required empty public constructor
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
        MostarFoto();
        return view;
    }

    private void obtenerViews(View view){
        foto = view.findViewById(R.id.imageViewPefil);
        btnCambiarFoto = view.findViewById(R.id.btnCambiar);
    }

    public void Cambiar(){
        btnCambiarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               cargarImagen();
            }
        });

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

            //File photoFile = new File(path);
            getRealPathFromUri(getContext(),path);


          /*  Call<ResponseTrabajador> call = trabajadorInterface.actualizarFoto(photoFile);

            call.enqueue(new Callback<ResponseTrabajador>() {
                @Override
                public void onResponse(Call<ResponseTrabajador> call, Response<ResponseTrabajador> response) {
                    if (response.isSuccessful()) {
                      //  listadelantoSueldoMODELS = response.body().getAaData();
                        System.out.println("RESPONSEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"+response);
                        //adapterAdelantoSueldo = new ListAdapterAdelantoSueldo(getContext(), listadelantoSueldoMODELS);
                        //listViewAdelantarSueldo.setAdapter(adapterAdelantoSueldo);
                    }
                }
                @Override
                public void onFailure(Call<ResponseTrabajador> call, Throwable t) {
                    System.out.println("Error"+ t);
                }
            });*/

        }

    }

    private void retrofitInit() {
        iTrabajador = ITrabajador.getInstance();
        trabajadorInterface = iTrabajador.getTrabajadorInterface();
    }

    public void MostarFoto(){

        TrabajadorMODEL trabajadorMODEL = SharedPreferencesManager.getTrabajadorMODEL();
        System.out.println("FOTO: !!!!!!!!!!!!!!!!!!!!!!!!!!"+trabajadorMODEL.getFoto());

        Picasso.get().load(Comunes.URL_BACK +"api/trabajador/uploadImage/img/"+trabajadorMODEL.getFoto()).into(foto);
        //https://plantec-back-movil.herokuapp.com/uploadImage/img/
        //foto.setImageURI();
      /*  Call<ResponseTrabajador> call = trabajadorInterface.mostrarFoto(trabajadorMODEL.getFoto());
        call.enqueue(new Callback<ResponseTrabajador>() {
            @Override
            public void onResponse(Call<ResponseTrabajador> call, Response<ResponseTrabajador> response) {
                if (response.isSuccessful()) {
                   // foto.setImageDrawable(response.);
                    System.out.println("FOTO: !!!!!!!!!!!!!!!!!!!!!!!!!!"+trabajadorMODEL.getFoto());
                }
            }
            @Override
            public void onFailure(Call<ResponseTrabajador> call, Throwable t) {
                System.out.println("Error"+ t);
            }
        });*/
    }

    public static String getRealPathFromUri(Context context, Uri contentUri) {
        Cursor cursor = null;
        try {
            String[] proj = { MediaStore.Images.Media.DATA };
            cursor = context.getContentResolver().query(contentUri, proj, null, null, null);
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            cursor.moveToFirst();
            final File file = new File(Environment.getExternalStorageDirectory(), "read.me");
            contentUri = Uri.fromFile(file.getParentFile());
            File auxFile = new File(contentUri.getPath());
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
