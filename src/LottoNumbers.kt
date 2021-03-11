import java.util.*
import java.util.stream.Collector
import kotlin.collections.HashSet

fun LottoNumbers() {
    //create random numbers for 7자리
    val selected : HashSet<Int> = hashSetOf()
    while (true){
        val random = Random()
        val num = random.nextInt(45)+1
        if(selected.add(num)){
            if (selected.size ==7){
                break;
            }
        }
    }
    println("나의 luck : " + selected)
}
fun main(args: Array<String>){
    //몇개 만들지 1~5 사이 번호 입력받기
    val sc:Scanner = Scanner(System.`in`)
    println("숫자를 입력하세요")
    val num= sc.nextInt()

    for(i in 1..num){
        LottoNumbers()
    }


    //LottoNumbers() 를 그 수만큼 반복하여 출력






}