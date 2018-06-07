package com.github.cthawanapong.flexibleadapterx.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.cthawanapong.flexibleadapterx.sample.adapter.ShowcaseAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        @JvmStatic
        private val TAG = MainActivity::class.java.simpleName
    }

    private val mAdapter by lazy { ShowcaseAdapter(this@MainActivity).apply { resetAdapter() } }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        recyclerView.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 1, RecyclerView.VERTICAL, false)
        }
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        mAdapter.showEmpty()
    }
}
