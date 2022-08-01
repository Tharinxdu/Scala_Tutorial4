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
    println(formatName("Niroshan".substring(0,2))(toUpper)+formatName("Niroshan".substring(2))(toLower))
    println(formatName("Saman")(toLower))
    println(formatName("Kumara".substring(0,1))(toUpper)+formatName("Kumara".substring(1,5))(toLower)+formatName("Kumara".substring(5))(toUpper))
}