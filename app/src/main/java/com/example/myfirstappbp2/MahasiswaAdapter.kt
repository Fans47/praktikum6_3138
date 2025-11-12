package com.example.myfirstappbp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter(private val listMahasiswa: List<Mahasiswa>) :
    RecyclerView.Adapter<MahasiswaAdapter.ViewHolder>() {

    // Inner class ViewHolder
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_nama: TextView = itemView.findViewById(R.id.tv_nama_mahasiswa)
        val tv_nim: TextView = itemView.findViewById(R.id.tv_nim_mahasiswa)
    }

    // Membuat ViewHolder baru dari layout item_row_mahasiswa.xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_mahasiswa, parent, false)
        return ViewHolder(view)
    }

    // Mengisi data ke ViewHolder berdasarkan posisi
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mahasiswa = listMahasiswa[position]
        holder.tv_nama.text = mahasiswa.nama
        holder.tv_nim.text = mahasiswa.nim

        // Tambahkan listener klik
        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Anda mengklik: ${mahasiswa.nama}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    // Mengembalikan jumlah item dalam list
    override fun getItemCount(): Int {
        return listMahasiswa.size
    }
}