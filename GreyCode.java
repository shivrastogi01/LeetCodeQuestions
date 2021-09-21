class GreyCode {
    public List<Integer> grayCode(int n) {
        List<Integer> l = new ArrayList<Integer>();
        int c = (int)Math.pow(2,n);
        for(int i=0;i<c;i++){
            int s = 0;
            s = i ^ (i>>1);
            l.add(s);
        }
        return l;
    }
}