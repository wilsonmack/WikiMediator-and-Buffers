package cpen221.mp3.wikimediator.Requests;

import java.math.BigInteger;

public class TrendingRequest extends Request{
    private BigInteger timeLimitInSeconds;
    private int maxItems;

    public TrendingRequest(BigInteger time, int id, BigInteger timeLimitInSeconds, int maxItems){
        super(time, RequestType.TRENDING, id);
        this.timeLimitInSeconds = timeLimitInSeconds;
        this.maxItems = maxItems;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public BigInteger getTimeLimitInSeconds() {
        return timeLimitInSeconds;
    }
}