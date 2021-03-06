package com.kermitye.xmarqueeview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kermitye.xmarqueeview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    val adapter by lazy { MarqueeViewAdapter(this, arrayListOf<String>().apply {
        for (i in 1..10) {
            add("初始化数据: $i")
        }
    }) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //是否设置动画时间间隔
//        binding.queeView.isSetAnimDuration = true
        //动画时间
//        binding.queeView.animDuration = 2000
        //轮播间隔时间
//        binding.queeView.flipInterval = 1500
        binding.queeView.setItemCount(1)
        binding.queeView.setAdapter(adapter)
    }

    fun refreshData(view: View) {
        val currentIndex = binding.queeView.displayedChild
        Toast.makeText(this, "当前: $currentIndex", Toast.LENGTH_SHORT).show()

        /*adapter.setData(arrayListOf<String>().apply {
//            for (i in 1..10) {
                add("刷新的数据: 0")
//            }
        })*/
    }
}