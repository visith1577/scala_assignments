object Answer {

    def encrypt(word: String, shift: Int): String = {
        val encryptedWord = word.map(char => if (char.isLetter) {
            val base = if (char.isUpper) 'A' else 'a'
            ((char - base + shift) % 26 + base).toChar
        } else {
            char       
        })
        encryptedWord
    }

    def decrypt(word: String, shift: Int): String = {
        encrypt(word, 26 - shift)
    }

    def cipher(word: String, shift: Int, cipherFunc: (String, Int) => String): String = cipherFunc(word, shift)

    def main(args: Array[String]): Unit = {
        val word = "Hello, World!"  
        val shift = 5

        val encryptedWord = cipher(word, shift, encrypt)
        val decryptedWord = cipher(encryptedWord, shift, decrypt)

        println("Plain word: " + word)
        println("Encrypted word: " + encryptedWord)
        println("Decrypted word: " + decryptedWord)
    }
}