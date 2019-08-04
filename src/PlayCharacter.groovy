class PlayCharacter {
    String name
    def scenes = []

    PlayCharacter(){
        this.name = ''
    }

    PlayCharacter(String name){
        this.name = name
    }

    boolean hasConflict(PlayCharacter other){}

    String[] getScenes(){}

    String[] noConflictCharacters(){}

    void setScene(String scene){
        scenes << scene
    }

    List getSceneList(){
        return scenes
    }

    boolean isIn(String scene){
        if (scenes.contains(scene)){
            return true
        }
        return false
    }

    int noOfLines(){}

    boolean deleteConflict(){}


}
