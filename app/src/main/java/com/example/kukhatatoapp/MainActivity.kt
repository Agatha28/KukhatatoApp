package com.example.kukhatatoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)


        foodList = ArrayList()

        foodList.add(Food(R.drawable.dangkotbebek, "Dangkot Bebek","Kuliner khas Tana Toraja yang satu ini terbuat dari daging bebek yang olahan bumbu khusus. Rasanya sangat nikmat yakni perpaduan rasa gurih, asin dan pedas."))
        foodList.add(Food(R.drawable.deppatori, "Deppatori","Makanan ini cocok untuk mengganjal rasa lapar yang suka datang tanpa diundang. Terbuat dari tepung beras dan gula merah serta taburan wijen."))
        foodList.add(Food(R.drawable.kapurung, "Kapurung", "Makanan khas Toraja selanjutnya yang tidak kalah unik adalah kapurung. Makanan berkuah satu ini terbuat dari berbagai jenis sayuran seperti kangkung, kacang panjang, dan labu merah muda."))
        foodList.add(Food(R.drawable.koteng, "Koteng","Koteng adalah makanan yang berupa olahan keong. Keong yang berhasil dikumpulkan dari sawah dicuci bersih lalu kemudian ditumis dengan menggunakan bumbu dan diberi sedikit kuah."))
        foodList.add(Food(R.drawable.pangrarang, "Pangrarang","Sate khas Toraja sering disebut dengan pangrarang.Hal yang membedakan pangrarang dengan sate lain adalah pada bumbunya. Bumbu yang digunakan untuk membuat sate ini adalah garam saja."))
        foodList.add(Food(R.drawable.pantollobale, "Pantollo Bale","Kuliner khas Tana Toraja yang satu ini sangat menarik untuk anda coba. Pantollo ini terbuat dari bahan ikan mas yang gurih."))
        foodList.add(Food(R.drawable.pantollodukku, "Pantollo Dukku","Kuliner khas Tana Toraja dengan bahan dasar yang digunakan adalah daging babi yang ditambahkan dengan lombok katokkon untuk meningkatkan sensasi pedasnya."))
        foodList.add(Food(R.drawable.pantollolendong, "Pantollo Lendong","Pantollo Lendong menggunakan bahan dasar belut. Makanan ini umumnya tersajikan ketika ada acara atau upacara adat."))
        foodList.add(Food(R.drawable.pantollopamarrasan, "Pantollo Pamarrasan","Pantollo Pamarrasan Kuliner khas Tana Toraja yang terkenal dengan bumbu hitamnya."))
        foodList.add(Food(R.drawable.pokon, "Pokon","Pokon merupakan kuliner berbahan dasar ketan hitam yang dicampuri parutan kelapa kemudian dibungkus seperti lontong dengan menggunakan daun bambu."))


        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

        foodAdapter.onItemClick = {
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("food", it)
            startActivity(intent)
        }
    }
}