object Assignment2 {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5

    val k: Float = 4.3

    def main(args: Array[String]): Unit = {
        b -= 1
        println((b * a + c *d))

        d -= 1

        println(a)

        a += 1

        // println(-2*(g-k)+c)
        
        println (c);

        c += 1

        println (c*a);
        
        a += 1
    }
}

// java code

// class HelloWorld {
//     public static void main(String[] args) {
//         int c = 4;
//         int a = 2;
//         int b = 3;
//         int d = 5;
        
//         float k = 4.3f;
        
//         System.out.println(--b*a+c*d--);
//         System.out.println(a++);
//         System.out.println (c=c++);
//         System.out.println (c=++c*a++);
//         System.out.println(c=++c*a++);
//     }
// }