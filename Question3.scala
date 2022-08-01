def toUpper(x:String)={
    x.toUpperCase
}

def toLower(x:String)={
    x.toLowerCase
}

def formatName(name:String)(f:String=>String)={
    f(name)
}

object O5 extends App{
    println(formatName("Benny")(toUpper))
    println(formatName("Niroshan")(toLower))
    println(formatName("Saman")(toUpper))
}