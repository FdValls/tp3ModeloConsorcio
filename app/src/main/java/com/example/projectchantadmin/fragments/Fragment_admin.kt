package com.example.projectchantadmin.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.projectchantadmin.R
import com.example.projectchantadmin.utils.UserSession
import com.example.projectchantadmin.utils.WeatherSession
import kotlinx.android.synthetic.main.fragment_admin.*

class Fragment_admin : Fragment() {

    private lateinit var fotoPerfil: ImageView
    private lateinit var paisPerfil: TextView
    private lateinit var horaPerfil: TextView
    private lateinit var tempPerfil: TextView
    private lateinit var nombreCompleto: TextView
    private lateinit var btbContacto: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        paisPerfil = view.findViewById(R.id.id_pais_perfil)
        horaPerfil = view.findViewById(R.id.id_hora_perfil)
        tempPerfil = view.findViewById(R.id.id_temp_perfil)
        nombreCompleto = view.findViewById(R.id.id_nombre_completo_admin)

        btbContacto = view.findViewById(R.id.id_btn_contacto)
        btbContacto.setBackgroundColor(Color.BLACK)

        fotoPerfil = view.findViewById(R.id.id_photo_perfil)
        Glide.with(this)
            .load(UserSession.userPhoto)
            .circleCrop()
            .override(300, 300)
            .into(fotoPerfil)

        nombreCompleto.text = "Hola, ${UserSession.userName}"
        paisPerfil.text = WeatherSession.pais
        horaPerfil.text = WeatherSession.hora
        tempPerfil.text = WeatherSession.temperatura

    }

}