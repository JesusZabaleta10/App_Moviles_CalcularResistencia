package com.example.calcularresistencia

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var num_C1 = 1
    private var num_C2 = 0
    private var multiplicador = 1
    private var tolerancia = " ± 5 %"
    private var signo = " Ω"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // INITIAL RESISTANCE (10 Ω ± 5) ------------------------------------------
        tv_resultado.text = "10.0 Ω ± 5 %"

        // COLUMN 1 --------------------------------------------------------
        button5.setOnClickListener {
            Toast.makeText(this, "Café", Toast.LENGTH_SHORT).show()
            button_banda1.setBackgroundColor(Color.parseColor("#8b4513"))
            num_C1 = 1
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = "  MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button9.setOnClickListener {
            Toast.makeText(this, "Rojo", Toast.LENGTH_SHORT).show()
            button_banda1.setBackgroundColor(Color.parseColor("#ff0000"))
            num_C1 = 2
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button13.setOnClickListener {
            Toast.makeText(this, "Naranja", Toast.LENGTH_SHORT).show()
            button_banda1.setBackgroundColor(Color.parseColor("#ff8c00"))
            num_C1 = 3
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button17.setOnClickListener {
            Toast.makeText(this, "Amarillo", Toast.LENGTH_SHORT).show()
            button_banda1.setBackgroundColor(Color.parseColor("#ffff00"))
            num_C1 = 4
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button21.setOnClickListener {
            Toast.makeText(this, "Verde", Toast.LENGTH_SHORT).show()
            button_banda1.setBackgroundColor(Color.parseColor("#008000"))
            num_C1 = 5
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button25.setOnClickListener {
            Toast.makeText(this, "Azul", Toast.LENGTH_SHORT).show()
            button_banda1.setBackgroundColor(Color.parseColor("#0000ff"))
            num_C1 = 6
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button29.setOnClickListener {
            Toast.makeText(this, "Morado", Toast.LENGTH_SHORT).show()
            button_banda1.setBackgroundColor(Color.parseColor("#800080"))
            num_C1 = 7
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button33.setOnClickListener {
            Toast.makeText(this, "Gris", Toast.LENGTH_SHORT).show()
            button_banda1.setBackgroundColor(Color.parseColor("#808080"))
            num_C1 = 8
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button37.setOnClickListener {
            Toast.makeText(this, "Blanco", Toast.LENGTH_SHORT).show()
            button_banda1.setBackgroundColor(Color.parseColor("#ffffff"))
            num_C1 = 9
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        // -----------------------------------------------------------------------

        // COLUMN 2 -----------------------------------------------------------
        button2.setOnClickListener {
            Toast.makeText(this, "Negro", Toast.LENGTH_SHORT).show()
            button_banda2.setBackgroundColor(Color.parseColor("#000000"))
            num_C2 = 0
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button6.setOnClickListener {
            Toast.makeText(this, "Café", Toast.LENGTH_SHORT).show()
            button_banda2.setBackgroundColor(Color.parseColor("#8b4513"))
            num_C2 = 1
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button10.setOnClickListener {
            Toast.makeText(this, "Rojo", Toast.LENGTH_SHORT).show()
            button_banda2.setBackgroundColor(Color.parseColor("#ff0000"))
            num_C2 = 2
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button14.setOnClickListener {
            Toast.makeText(this, "Naranja", Toast.LENGTH_SHORT).show()
            button_banda2.setBackgroundColor(Color.parseColor("#ff8c00"))
            num_C2 = 3
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button18.setOnClickListener {
            Toast.makeText(this, "Amarillo", Toast.LENGTH_SHORT).show()
            button_banda2.setBackgroundColor(Color.parseColor("#ffff00"))
            num_C2 = 4
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button22.setOnClickListener {
            Toast.makeText(this, "Verde", Toast.LENGTH_SHORT).show()
            button_banda2.setBackgroundColor(Color.parseColor("#008000"))
            num_C2 = 5
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button26.setOnClickListener {
            Toast.makeText(this, "Azul", Toast.LENGTH_SHORT).show()
            button_banda2.setBackgroundColor(Color.parseColor("#0000ff"))
            num_C2 = 6
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button30.setOnClickListener {
            Toast.makeText(this, "Morado", Toast.LENGTH_SHORT).show()
            button_banda2.setBackgroundColor(Color.parseColor("#800080"))
            num_C2 = 7
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button34.setOnClickListener {
            Toast.makeText(this, "Gris", Toast.LENGTH_SHORT).show()
            button_banda2.setBackgroundColor(Color.parseColor("#808080"))
            num_C2 = 8
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button38.setOnClickListener {
            Toast.makeText(this, "Blanco", Toast.LENGTH_SHORT).show()
            button_banda2.setBackgroundColor(Color.parseColor("#ffffff"))
            num_C2 = 9
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        //----------------------------------------------------------------------

        // COLUMN 3 -----------------------------------------------------------
        button3.setOnClickListener {
            Toast.makeText(this, "Negro", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#000000"))
            multiplicador = 1
            signo = " Ω"
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button7.setOnClickListener {
            Toast.makeText(this, "Café", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#8b4513"))
            multiplicador = 10
            signo = " Ω"
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button11.setOnClickListener {
            Toast.makeText(this, "Rojo", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#ff0000"))
            multiplicador = 100
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            resultado = resultado/1000
            signo = " kΩ"
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button15.setOnClickListener {
            Toast.makeText(this, "Naranja", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#ff8c00"))
            multiplicador = 1000
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            resultado = resultado/1000
            signo = " kΩ"
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button19.setOnClickListener {
            Toast.makeText(this, "Amarillo", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#ffff00"))
            multiplicador = 10000
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            resultado = resultado/1000
            signo = " kΩ"
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button23.setOnClickListener {
            Toast.makeText(this, "Verde", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#008000"))
            multiplicador = 100000
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            resultado = resultado/1000000
            signo = " MΩ"
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button27.setOnClickListener {
            Toast.makeText(this, "Azul", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#0000ff"))
            multiplicador = 1000000
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            resultado = resultado/1000000
            signo = " MΩ"
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button31.setOnClickListener {
            Toast.makeText(this, "Morado", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#800080"))
            multiplicador = 10000000
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            resultado = resultado/1000000
            signo = " MΩ"
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button35.setOnClickListener {
            Toast.makeText(this, "Gris", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#808080"))
            multiplicador = 100000000
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            resultado = resultado/1000000000
            signo = " GΩ"
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button39.setOnClickListener {
            Toast.makeText(this, "Blanco", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#ffffff"))
            multiplicador = 1000000000
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            resultado = resultado/1000000000
            signo = " GΩ"
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button43.setOnClickListener {
            Toast.makeText(this, "Dorado", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#b8860b"))
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()/10
            signo = " Ω"
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button47.setOnClickListener {
            Toast.makeText(this, "Plata", Toast.LENGTH_SHORT).show()
            button_banda3.setBackgroundColor(Color.parseColor("#c0c0c0"))
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()/100
            signo = " Ω"
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        //----------------------------------------------------------------------

        // COLUMN 4 -----------------------------------------------------------
        button8.setOnClickListener {
            Toast.makeText(this, "Café", Toast.LENGTH_SHORT).show()
            button_banda4.setBackgroundColor(Color.parseColor("#8b4513"))
            tolerancia = " ± 1 %"
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button12.setOnClickListener {
            Toast.makeText(this, "Rojo", Toast.LENGTH_SHORT).show()
            button_banda4.setBackgroundColor(Color.parseColor("#ff0000"))
            tolerancia = " ± 2 %"
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button24.setOnClickListener {
            Toast.makeText(this, "Verde", Toast.LENGTH_SHORT).show()
            button_banda4.setBackgroundColor(Color.parseColor("#008000"))
            tolerancia = " ± 0.5 %"
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button28.setOnClickListener {
            Toast.makeText(this, "Azul", Toast.LENGTH_SHORT).show()
            button_banda4.setBackgroundColor(Color.parseColor("#0000ff"))
            tolerancia = " ± 0.25 %"
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button32.setOnClickListener {
            Toast.makeText(this, "Morado", Toast.LENGTH_SHORT).show()
            button_banda4.setBackgroundColor(Color.parseColor("#800080"))
            tolerancia = " ± 0.1 %"
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button36.setOnClickListener {
            Toast.makeText(this, "Gris", Toast.LENGTH_SHORT).show()
            button_banda4.setBackgroundColor(Color.parseColor("#808080"))
            tolerancia = " ± 0.05 %"
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button44.setOnClickListener {
            Toast.makeText(this, "Dorado", Toast.LENGTH_SHORT).show()
            button_banda4.setBackgroundColor(Color.parseColor("#b8860b"))
            tolerancia = " ± 5 %"
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
        button48.setOnClickListener {
            Toast.makeText(this, "Plata", Toast.LENGTH_SHORT).show()
            button_banda4.setBackgroundColor(Color.parseColor("#c0c0c0"))
            tolerancia = " ± 10 %"
            var concatenar = num_C1.toString() + num_C2.toString()
            var resultado = concatenar.toDouble()*multiplicador
            if(multiplicador==100){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==1000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==10000){
                resultado = resultado/1000
                signo = " kΩ"
            }
            else if(multiplicador==100000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==1000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==10000000){
                resultado = resultado/1000000
                signo = " MΩ"
            }
            else if(multiplicador==100000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            else if(multiplicador==1000000000){
                resultado = resultado/1000000000
                signo = " GΩ"
            }
            tv_resultado.text = resultado.toString() + signo + tolerancia
        }
    }
}