package com.example.animgame01

import android.animation.Animator
import android.animation.AnimatorInflater
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val headAnimator = AnimatorInflater.loadAnimator(this,R.animator.animator_start)
        val spineAnimator = AnimatorInflater.loadAnimator(this,R.animator.animator_start)
        val tShirtAnimator = AnimatorInflater.loadAnimator(this,R.animator.animator_start)
        val leftHandAnimator = AnimatorInflater.loadAnimator(this,R.animator.animator_stop)
        val rightHandAnimator = AnimatorInflater.loadAnimator(this,R.animator.animator_stop)
        val leftFootAnimator = AnimatorInflater.loadAnimator(this,R.animator.animator_stop)
        val rightFootAnimator = AnimatorInflater.loadAnimator(this,R.animator.animator_stop)

        clear_Views.setOnClickListener {
            headAnimator.setTarget(head_image)
            headAnimator.start()
            spineAnimator.setTarget(spine_image)
            spineAnimator.start()
            tShirtAnimator.setTarget(t_shirt_image)
            tShirtAnimator.start()
            leftHandAnimator.setTarget(left_hand_image)
            leftHandAnimator.start()
            rightHandAnimator.setTarget(right_hand_image)
            rightHandAnimator.start()
            leftFootAnimator.setTarget(left_foot_image)
            leftFootAnimator.start()
            rightFootAnimator.setTarget(right_foot_image)
            rightFootAnimator.start()
        }

        center_startButton.setOnClickListener {
            headAnimator.setTarget(head_image)
            headAnimator.resume()
        }
        center_stopButton.setOnClickListener {
            headAnimator.setTarget(head_image)
            headAnimator.pause()
        }
        left_hand_startButton.setOnClickListener {
            leftHandAnimator.setTarget(left_hand_image)
            leftHandAnimator.resume()
        }
        left_hand_stopButton.setOnClickListener {
            leftHandAnimator.setTarget(left_hand_image)
            leftHandAnimator.pause()
        }
        right_hand_startButton.setOnClickListener {
            rightHandAnimator.setTarget(left_hand_image)
            rightHandAnimator.resume()
        }
        right_hand_stopButton.setOnClickListener {
            rightHandAnimator.setTarget(left_hand_image)
            rightHandAnimator.pause()
        }
        spine_startButton.setOnClickListener {
            spineAnimator.setTarget(left_hand_image)
            spineAnimator.resume()
        }
        spine_stopButton.setOnClickListener {
            spineAnimator.setTarget(left_hand_image)
            spineAnimator.pause()
        }
        t_shirt_startButton.setOnClickListener {
            tShirtAnimator.setTarget(left_hand_image)
            tShirtAnimator.resume()
        }
        t_shirt_stopButton.setOnClickListener {
            tShirtAnimator.setTarget(left_hand_image)
            tShirtAnimator.pause()
        }
        left_foot_startButton.setOnClickListener {
            leftFootAnimator.setTarget(left_hand_image)
            leftFootAnimator.resume()
        }
        left_foot_stopButton.setOnClickListener {
            leftFootAnimator.setTarget(left_hand_image)
            leftFootAnimator.pause()
        }
        right_foot_startButton.setOnClickListener {
            rightFootAnimator.setTarget(left_hand_image)
            rightFootAnimator.resume()
        }
        right_foot_stopButton.setOnClickListener {
            rightFootAnimator.setTarget(left_hand_image)
            rightFootAnimator.pause()
        }
    }
}