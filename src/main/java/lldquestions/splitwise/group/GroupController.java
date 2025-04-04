package lldquestions.splitwise.group;

import lldquestions.splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {

    List<Group> groups;

    public GroupController() {
        groups = new ArrayList<>();
    }

    public void createNewGroup(String groupId, String groupName, User createdByUser) {
        Group group = new Group();
        group.setId(groupId);
        group.setName(groupName);

        group.addMember(createdByUser);

        groups.add(group);
    }

    public Group getGroup(String groupId){

        for(Group group: groups) {

            if(group.getId().equals(groupId)){
                return group;
            }
        }
        return null;
    }


}
