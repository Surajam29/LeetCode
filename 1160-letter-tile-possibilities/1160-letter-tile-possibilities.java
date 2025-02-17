class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        generateSequences(tiles,"",set);
        return set.size();
    }

    private static void generateSequences(String tiles,String sequence,HashSet<String> set)
    {
        if(!sequence.isEmpty()){
            set.add(sequence);
        }

        for(int i=0;i < tiles.length(); i++){
            generateSequences(tiles.substring(0,i) + tiles.substring(i + 1), sequence + tiles.charAt(i),set);
        }
    }
}