package com.example.bottomsheetdialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_bottom_sheet.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowBottomSheetDialog.setOnClickListener {
            val bottomSheetDialog: BottomSheetDialog = BottomSheetDialog(this, R.style.BottomSheetDialogTheme)
            val bottomSheetView :View = LayoutInflater.from(applicationContext).inflate(R.layout.layout_bottom_sheet,bottomSheetContainer)
            bottomSheetView.findViewById<Button>(R.id.btnShare).setOnClickListener {
                Toast.makeText(this,"Share", android.widget.Toast.LENGTH_SHORT).show()
                bottomSheetDialog.dismiss()
            }
            bottomSheetDialog.setContentView(bottomSheetView)
            bottomSheetDialog.show()
        }


    }
}
