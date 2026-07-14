// Last updated: 14/07/2026, 14:47:33
class RandomizedSet {
        private Map<Integer,Integer> map;
        private List<Integer> list;
        private Random rand;
    public RandomizedSet() {
        this.map=new HashMap<>();
        this.list=new ArrayList<>();
        this.rand=new Random();
    }
    
    public boolean insert(int val) {
        if(this.map.containsKey(val)){
            return false;
        }
        int index=this.list.size();
        this.list.add(val);
        this.map.put(val,index);
        return true;
    }
    
    public boolean remove(int val) {
        if(!this.map.containsKey(val)){
            return false;
        }
        if(this.list.size()==0){
            return false;
        }
        int index=this.list.size()-1;
        int temp=this.list.get(index);
        int ind=this.map.get(val);
        this.list.set(ind,temp);
        this.map.put(temp,ind);
        this.list.remove(index);
        this.map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int temp=this.rand.nextInt(this.list.size());
        return this.list.get(temp);
    }
}
