package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var aBig = a.toUpperCase()

        if(aBig.indexOf(b)>0){
            return "YES"
        }else{
            var s=""
            for(x in 0 ..a.count()-1){
                for (y in 0 .. b.count()-1){
                    if (aBig[x]==b[y]){
                        s+=aBig[x]
                        break
                    }
                }
            }
            return if(s.indexOf(b)>-1){
                "YES"
            }else{
                "NO"
            }
        }
    }
}
