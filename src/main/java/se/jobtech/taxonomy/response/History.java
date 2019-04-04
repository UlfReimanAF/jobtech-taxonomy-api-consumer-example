package se.jobtech.taxonomy.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
public class History {

    private String category;
    private String preferredTerm;

    private String newPreferredTerm;


    private String oldpreferredTerm;

    private boolean deprecated;

    private BigInteger transactionId;

    private Date timestamp;
    SimpleDateFormat ft =new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");


}
