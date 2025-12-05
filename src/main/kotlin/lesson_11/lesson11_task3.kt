package lesson_11

enum class Status(val fullStatus: String) {
    SPEAK("разговаривает"),
    MUTE("микрофон выключен"),
    SILENT("пользователь заглушен")
}

class Member(
    val avatar: String,
    val nickname: String,
    var speakStatus: Status = Status.MUTE
)

class Room(
    val cover: String,
    val title: String,
    val listOfMembers: MutableList<Member>
    //val listOfAvatar: MutableList<String>,
    //val listOfNickname: MutableList<String>
) {
    fun addMember(member: Member) {
        listOfMembers.add(member)
        //listOfAvatar.add(member.avatar)
        //listOfNickname.add(member.nickname)
    }

    fun updateStatus(nickname: String, newSpeakStatus: Status) {
        for (i in 0 until listOfMembers.size) {
            if (listOfMembers[i].nickname == nickname) {
                listOfMembers[i].speakStatus = newSpeakStatus
            }
        }
    }

    fun printRoomInfo() {
        println("================================")
        println("Комната: $title")
        println("Обложка комнаты: \"$cover\"")
        println("================================")

        listOfMembers.forEach {
            println("Никнейм: ${it.nickname}")
            println("Аватар: ${it.avatar}")
            println("Аватар: ${it.speakStatus.fullStatus}")
            println()
        }
    }
}

fun main() {
    val member1 = Member("Тигр.jpg", "Петр")
    val member2 = Member("Лев.jpg", "Сергей")
    val member3 = Member("Гусь.jpg", "Иван")

    val room = Room(
        cover = "Зоопарк.jpg",
        title = "Клуб любителей животных",
        listOfMembers = mutableListOf(
            member1,
            member2,
            member3
        )
    )

    room.printRoomInfo()
    room.updateStatus("Петр", Status.SILENT)
    room.printRoomInfo()
}
