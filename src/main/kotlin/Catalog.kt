class Catalog {
    val name: String = "Catalogue"
    val regions: MutableList<Region> = mutableListOf()

    fun addRegion(region: Region) {
        regions.add(region)
    }


    fun deepElementCount(): Int {
        return 1 + regions.sumOf { it.deepElementCount() }
    }

    /**
    fun deepElementCount(): Int {
        return regions.sumOf { it.deepElementCount() } + 1
    }*/

    
    fun toText(): String {
        val sb = StringBuilder()
        sb.append(name).append("\n")
        for (region in regions) {
            sb.append(region.toText())
        }
        return sb.toString()
    }
}