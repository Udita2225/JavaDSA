package DailyChallengePracticeQuestions;

public class LeetCode3433CountMentionsPerUser {
    /*
    3433. Count Mentions Per User
    You are given an integer numberOfUsers representing the total number of users and an array events of size n x 3.

Each events[i] can be either of the following two types:

Message Event: ["MESSAGE", "timestampi", "mentions_stringi"]
This event indicates that a set of users was mentioned in a message at timestampi.
The mentions_stringi string can contain one of the following tokens:
id<number>: where <number> is an integer in range [0,numberOfUsers - 1]. There can be multiple ids separated by a single whitespace and may contain duplicates. This can mention even the offline users.
ALL: mentions all users.
HERE: mentions all online users.
Offline Event: ["OFFLINE", "timestampi", "idi"]
This event indicates that the user idi had become offline at timestampi for 60 time units. The user will automatically be online again at time timestampi + 60.
Return an array mentions where mentions[i] represents the number of mentions the user with id i has across all MESSAGE events.

All users are initially online, and if a user goes offline or comes back online, their status change is processed before handling any message event that occurs at the same timestamp.

Note that a user can be mentioned multiple times in a single message event, and each mention should be counted separately.



Example 1:

Input: numberOfUsers = 2, events = [["MESSAGE","10","id1 id0"],["OFFLINE","11","0"],["MESSAGE","71","HERE"]]

Output: [2,2]

Explanation:

Initially, all users are online.

At timestamp 10, id1 and id0 are mentioned. mentions = [1,1]

At timestamp 11, id0 goes offline.

At timestamp 71, id0 comes back online and "HERE" is mentioned. mentions = [2,2]

Example 2:

Input: numberOfUsers = 2, events = [["MESSAGE","10","id1 id0"],["OFFLINE","11","0"],["MESSAGE","12","ALL"]]

Output: [2,2]

Explanation:

Initially, all users are online.

At timestamp 10, id1 and id0 are mentioned. mentions = [1,1]

At timestamp 11, id0 goes offline.

At timestamp 12, "ALL" is mentioned. This includes offline users, so both id0 and id1 are mentioned. mentions = [2,2]

Example 3:

Input: numberOfUsers = 2, events = [["OFFLINE","10","0"],["MESSAGE","12","HERE"]]

Output: [0,1]

Explanation:

Initially, all users are online.

At timestamp 10, id0 goes offline.

At timestamp 12, "HERE" is mentioned. Because id0 is still offline, they will not be mentioned. mentions = [0,1]



Constraints:

1 <= numberOfUsers <= 100
1 <= events.length <= 100
events[i].length == 3
events[i][0] will be one of MESSAGE or OFFLINE.
1 <= int(events[i][1]) <= 105
The number of id<number> mentions in any "MESSAGE" event is between 1 and 100.
0 <= <number> <= numberOfUsers - 1
It is guaranteed that the user id referenced in the OFFLINE event is online at the time the event occurs.
    */



    /*
    class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
    events.sort((a, b) -> {
    int t1 = Integer.parseInt(a.get(1));
    int t2 = Integer.parseInt(b.get(1));

    if (t1 != t2) return t1 - t2;

    // If same timestamp → OFFLINE must come before MESSAGE
    if (!a.get(0).equals(b.get(0))) {
        return a.get(0).equals("OFFLINE") ? -1 : 1;
    }
    return 0;
});

//  No of Mentions Per User
    int[] mention = new int[numberOfUsers];

//  Time when the offline period of each user ends
    int[] offlineEnd = new int[numberOfUsers];

//  Whether each user is online or not. We will keep all the users online as mentioned in the question
    boolean[] online = new boolean[numberOfUsers];
    Arrays.fill(online,true);

    for(List<String> event: events){
        int time =  Integer.parseInt(event.get(1));
        String type = event.get(0);

//      At this time stamp.. make all the users online who will come online automatically after unit time of 60 units

        for(int user=0; user<numberOfUsers; user++){
            if(!online[user] && offlineEnd[user] <= time) online[user] = true;
        }

//      Handle OFFLINE users
        if(type.equals("OFFLINE")){
            int idx = Integer.parseInt(event.get(2));
            online[idx] = false;
            offlineEnd[idx] = time+60;
        }
        else{ // Handle MESSAGE Condition
            String msg = event.get(2);
            if(msg.equals("ALL")){
                for(int user=0; user<numberOfUsers; user++) mention[user]++;
            }
            else if(msg.equals("HERE")){
                for(int user=0; user<numberOfUsers; user++){
                    if(online[user]) mention[user]++;
                }
            }
            else{
                String[] tokens = msg.split(" ");
                for(int i=0; i<tokens.length; i++){
                    if(tokens[i].startsWith("id")){
                        int idx = Integer.parseInt(tokens[i].substring(2));
                        mention[idx]++;
                    }
                }
            }
        }
    }
    return mention;
    }
}
    */
}
