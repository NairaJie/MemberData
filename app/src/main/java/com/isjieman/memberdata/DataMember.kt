package com.isjieman.memberdata

object DataMember {
    private val dataNames = arrayOf(
        "Mark lee",
        "lee Haechan",
        "Park Jisung",
        "Zhong Chenle",
        "Huang Renjun",
        "Na Jaemin",
        "Lee Jeno"
    )

    private val dataId = arrayOf(
        "060600",
        "020899",
        "050202",
        "221101",
        "230300",
        "230400",
        "130800"
    )

    val listData: ArrayList<Data>
      get() {
        val list = arrayListOf<Data>()
        for (position in dataNames.indices) {
            val data = Data()
            data.name = dataNames[position]
            data.id = dataId [position]
            list.add(data)

        }
          return list


    }
}