class ShakespeareHelper {

    static int ShakespeareReader(filePath) {
        def listOfCharacterNames =
                ["DUNCAN",
                 "MALCOLM",
                 "DONALBAIN",
                 "MACBETH",
                 "BANQUO",
                 "MACDUFF",
                 "LENNOX",
                 "ROSS",
                 "MENTEITH",
                 "ANGUS",
                 "CAITHNESS",
                 "FLEANCE",
                 "First Witch",
                 "Second Witch",
                 "Third Witch"]
        def listOfCharacters = []

        listOfCharacterNames.each {
            PlayCharacter thisCharacter = new PlayCharacter(it)
            listOfCharacters << thisCharacter
        }

        def act1 = new File(filePath)
        String fullPlay = act1.text

        String[] splitByScene = fullPlay.split("SCENE")

        def act1Edit = new File('act1Edited.txt')
        act1Edit.text = ''

        PlayCharacter firstWitch = new PlayCharacter("First Witch")

        splitByScene.eachWithIndex { scene, index ->
            String sceneName = "Scene ${index}"
            if (scene.find("First Witch")){
                firstWitch.setScene(sceneName)
            }
            println("Is first witch in " + sceneName + "?")
            println(firstWitch.isIn(sceneName))
            println("------------------------")

            act1Edit.append("THIS IS SCENE ${index}\n")
            act1Edit.append(scene)
            act1Edit.append("------------------\n")
        }


        //act1Edit.write splitByScene[1]
        //String playNoReturns = fullPlay.replaceAll("\\s{10,}", " ")

        //file = file.split {}
        //line = "When the SCENE is over"
        //String[] splitLine = line.split("SCENE")

        return 0
    }


    static void main(String[] args) {
        def filePath = "macbeth-act1.txt"
        int file = ShakespeareReader(filePath)
    }
}
