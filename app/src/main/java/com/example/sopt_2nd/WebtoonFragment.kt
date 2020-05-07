package com.example.sopt_2nd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_webtoon.*

/**
 * A simple [Fragment] subclass.
 */
class WebtoonFragment : Fragment() {

    lateinit var webtoonAdapter: WebtoonAdapter
    val datas = mutableListOf<WebtoonData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_webtoon, container, false)
        //rv_webtoon.layoutManager = GridLayoutManager(context, 3)

        return inflater.inflate(R.layout.fragment_webtoon, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*한줄로만 아이템들이 나열되는 문제 해결 위해 추가해준 부분*/
        rv_webtoon.layoutManager = GridLayoutManager(context, 3)
        /*                                                    */

        webtoonAdapter = WebtoonAdapter(view.context)
        rv_webtoon.adapter = webtoonAdapter
        loadDatas()
    }

    private fun loadDatas() {
        datas.apply {
            add(
                WebtoonData(
                    title = "신의 탑",
                    img_contents = "https://cdn.pixabay.com/photo/2015/05/02/08/02/angel-749625__480.jpg",
                    grade = "★ 9.94",
                    writer = "SIU"
            ))
            add(
                WebtoonData(
                    title = "윈드브레이커",
                    img_contents = "https://cdn.pixabay.com/photo/2020/02/18/06/25/harvest-4858574__480.jpg",
                    grade = "★ 9.89",
                    writer = "조용석"
                ))
            add(
                WebtoonData(
                    title = "인생존망",
                    img_contents = "https://image.shutterstock.com/image-photo/stress-work-260nw-551085511.jpg",
                    grade = "★ 9.80",
                    writer = "박태준 / 전선욱"
                ))
            add(
                WebtoonData(
                    title = "소녀의 세계",
                    img_contents = "https://cdn.pixabay.com/photo/2014/05/03/00/56/summerfield-336672__480.jpg",
                    grade = "★ 9.98",
                    writer = "모랑지"
                ))
            add(
                WebtoonData(
                    title = "평범한 8반",
                    img_contents = "https://cdn.pixabay.com/photo/2017/03/28/12/07/bricks-2181920__480.jpg",
                    grade = "★ 9.85",
                    writer = "영파카"
                ))
            add(
                WebtoonData(
                    title = "백수세끼",
                    img_contents = "https://cdn.pixabay.com/photo/2015/09/13/03/41/man-937665__480.jpg",
                    grade = "★ 9.87",
                    writer = "치즈"
                ))
            add(
                WebtoonData(
                    title = "유일무이 로맨스",
                    img_contents = "https://cdn.pixabay.com/photo/2018/01/04/19/43/love-3061483__480.jpg",
                    grade = "★ 9.99",
                    writer = "두부"
                ))
            add(
                WebtoonData(
                    title = "칼가는 소녀",
                    img_contents = "https://cdn.pixabay.com/photo/2016/03/26/22/41/person-1281651__480.jpg",
                    grade = "★ 9.97",
                    writer = "오리"
                ))
            add(
                WebtoonData(
                    title = "이것도 친구라고",
                    img_contents = "https://image.shutterstock.com/image-photo/bored-man-listening-her-friend-260nw-1469039903.jpg",
                    grade = "★ 9.96",
                    writer = "제야"
                ))
        }
        webtoonAdapter.datas = datas
        webtoonAdapter.notifyDataSetChanged()
    }

}
