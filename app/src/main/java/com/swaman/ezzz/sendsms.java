package com.swaman.ezzz;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class sendsms {

    public static final String ACCOUNT_SID = "AC756dda1c17d827efcb1aa9ba0c3bace5";
    public static final String AUTH_TOKEN = "e6fe3ebbb40e1fa170802259a91ef891";

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        //String name = "abcd efgh";
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+14848668191"),
                new com.twilio.type.PhoneNumber("+16193751458"),
                "acbdjd"
        ).create();

        System.out.println(message.getSid());
    }

}
