
//arrays is a fixed collection of elements
//contenttostring to print an array
//it is possible to have an array of mixed types
//we can not chnge the size of an array but we can change the elements in an array

fun main() {
//    val arrayname = arrayOf(1,2,3,4,5)
//    arrayname[0] = 9
//
//
//    println(arrayname.contentToString())

    var friennds = arrayOf("Maria", "Snaida", "Betty", "Chris", "David", 24, 98, 'q', true, 44.3)
//    var names = arrayOf(52,24,98)
    var friend = arrayOf("Maria", "Snaida", "Betty", "Chris", "David")
    println(friennds.contentToString())
    println(friennds.get(0))
    println(friend.get(1))
//   var  x = friennds.set(0, "Goretti")
//    println(x)
    friennds[3] = "Diana"
    println(friennds.contentToString())
//
    var moreFriends = friend.plus("me")
    println(moreFriends.contentToString())
    var moreFriend = friennds.plus("more")
    println(moreFriend.contentToString())
//    println(moreFriend.contentToString())
//    var mate= moreFriends.plus(arrayOf("Rwanda","Kenya"))
//     println(mate.contentToString())

    var friends = arrayOf("Maria", "Esther", "Gladys", "Annabel")
    var Number = arrayOf(23, 43, 56, 76, 89)
    println(friends.count())
    println(friends.size)

    println(Number.sum())
    println(friends.max())//gives the one that STRts with the index on the end
    println(friends.min())
    println(Number.average())

//    println(friends.forEach, { friend -> println(friend)})
    //
    for (f in friends) {
        println(f)
    }

    println(friends.sortedArray().contentToString())
    println(friends.contentToString())
    println(Number.sortedArray().sortedDescending())
    println(Number.max())
    println(Number.min())
    println(Number.average())


}
