package maxain.englishwordsapp

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import maxain.englishwordsapp.databinding.ActivityLearnWordBinding
import maxain.englishwordsapp.databinding.ActivityLearnWordConstraintBinding
import maxain.englishwordsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // viewBinding
//    private lateinit var binding: ActivityLearnWordConstraintBinding

    private var _binding: ActivityLearnWordConstraintBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for ActivityLearnWordConstraint must not be null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        _binding = ActivityLearnWordConstraintBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_learn_word_constraint)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        // FindViewById
        // ViewBinding

//        val tvQuestionWord: TextView = findViewById(R.id.tvQuestionWord)
//        tvQuestionWord.text = "Galaxis"
//        tvQuestionWord.setTextColor(Color.BLUE)
//        tvQuestionWord.setTextColor(Color.parseColor("#b92b27"))
//        tvQuestionWord.setTextColor(ContextCompat.getColor(this,R.color.buttonBlueColor))

        binding.tvQuestionWord.text = "Galaxis"
        binding.tvQuestionWord.setTextColor(ContextCompat.getColor(this, R.color.buttonBlueColor))

        with(binding) {
            tvQuestionWord.text = "Inside 'with'"
        }
    }
}