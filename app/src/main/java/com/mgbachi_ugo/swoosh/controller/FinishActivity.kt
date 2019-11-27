package com.mgbachi_ugo.swoosh.controller

import android.os.Bundle
import com.mgbachi_ugo.swoosh.R
import com.mgbachi_ugo.swoosh.Utilities.EXTRA_LEAGUE
import com.mgbachi_ugo.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*


class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueTxt.text = "Looking for $league $skill league near you.."
    }
}
