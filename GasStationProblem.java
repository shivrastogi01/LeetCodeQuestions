class GasStationProblem {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int netGasRequired=0;
        for(int i=0;i<gas.length;i++){
            netGasRequired +=  gas[i]-cost[i];
        
        }
        if(netGasRequired <0) return -1;
        
        int currentGasAvail=0, startIdx=0;
        for(int i=0 ;i<gas.length;i++){
            currentGasAvail +=  gas[i]- cost[i];
            if(currentGasAvail <0){
                startIdx= i+1;
                currentGasAvail=0;
            }
        }
        return startIdx;
    }
}