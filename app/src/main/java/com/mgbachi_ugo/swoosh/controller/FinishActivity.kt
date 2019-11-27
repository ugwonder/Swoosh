package com.mgbachi_ugo.swoosh.controller

import android.os.Bundle
import com.mgbachi_ugo.swoosh.R
import com.mgbachi_ugo.swoosh.Utilities.EXTRA_PLAYER
import com.mgbachi_ugo.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_finish.*


class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueTxt.text = "Looking for ${player.league} ${player.skill} league near you.."
    }
}
