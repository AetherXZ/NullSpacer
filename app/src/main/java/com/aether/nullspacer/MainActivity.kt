package com.aether.nullspacer

import android.app.Activity
import android.os.Bundle

/** A deliberate no-op launcher target: launch, then immediately close. */
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        finish()
    }
}
