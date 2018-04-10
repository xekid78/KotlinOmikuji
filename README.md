# KotlinOmikuji
おみくじ

## 処理
`Random.nextInt()`メソッドを使用して1 ～ 6のランダムな数字でおみくじの結果を出力します。

## コード
```
import java.util.Random

fun main(args: Array<String>) {
    val r = Random()
    val num = r.nextInt(6) + 1
    val omikuji =
        if (num == 1) "大吉"
        else if (num == 2) "中吉"
        else if (num == 3) "小吉"
        else if (num == 4) "吉"
        else if (num == 5) "凶"
        else "大凶"    
    println(omikuji)
}
```

## 出力結果  
```
大吉
```

## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 仮想化ソフト | Oracle VM VirtualBox 5.2 |
| 構築ソフト | Vagrant 2.0.2 |
| 仮想化上OS | CentOS 6.9 |
| SSHクライアント | PuTTY 0.6.8 |
| FTPクライアント | Cyberduck 6.3.5 |
| エディタ | Atom 1.24.0 |
| 開発言語 | Kotlin 1.2.31 |
