package dasdsa.sdn.kotinbasic_20200523

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.InputEvent
import android.view.inputmethod.InputContentInfo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener {

//            로그로 버튼 이벤트 확인
//            Log.d("메인화면", "확인버튼눌림")
//            Log.e("에러발생", "호ㅘ")

            val InputContent = inputEdt.text.toString()

            resultTxt.text = InputContent

//            Log.d(

        }


    }
}
