package com.erni.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment:Fragment() {
    lateinit var listTeman : ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriend("Erni Septiani", "Perempuan", "erniseptiani248@gmail.com", "085784011532", "Kediri"))
        listTeman.add(MyFriend("Veti Ningrum", "Perempuan", "veti123@gmail.com", "085643216733", "Malang"))
        listTeman.add(MyFriend("Moh. Syamsul Arifin", "Laki-Laki", "syamsularifin09@gmail.com", "082133456217", "Bandung"))
        listTeman.add(MyFriend("Ahmad Faisal", "Laki-Laki", "faisal_24@gmail.com", "085344217764", "Madura"))
        listTeman.add(MyFriend("Risma Dewi Aprilliya", "Perempuan", "rismaaa12@gmail.com", "082124531176", "Lampung"))
        listTeman.add(MyFriend("Alvin Ade Sindy", "Laki-Laki", "alvinade66@gmail.com", "085433216685", "Surabaya"))
        listTeman.add(MyFriend("Kanti Wilujeng", "Perempuan", "kantii78af@gmail.com", "085988654320", "Makassar"))
        listTeman.add(MyFriend("Feri Efendi", "Laki-Laki", "efendi_feri07@gmail.com", "082133427655", "Madiun"))
        listTeman.add(MyFriend("Muhamad Idzam Syahroni", "Laki-Laki", "idzamxx132@gmail.com", "081543217665", "Nganjuk"))
        listTeman.add(MyFriend("Indah Kurniani", "Perempuan", "indah_kurnia440@gmail.com", "085344553218", "Palembang"))
        listTeman.add(MyFriend("Mochammad Khafidz", "Laki-Laki", "mocca_56kl@gmail.com", "081345628874", "NTT"))
    }

    private fun tampilTeman() {
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter (requireActivity(), listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends,container,false )
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this
            .clearFindViewByIdCache()
    }
}

