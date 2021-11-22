package com.example.android_lab3quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_lab3quiz.databinding.FragmentQuestionDetailBinding
import quiz.Question


class QuestionDetailFragment : Fragment() {

    private lateinit var binding: FragmentQuestionDetailBinding
    private lateinit var question:Question
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_question_detail, container, false)
    }
}