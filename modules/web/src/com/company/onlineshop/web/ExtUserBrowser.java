package com.company.onlineshop.web;

import com.company.onlineshop.entity.ExtUser;
import com.haulmont.cuba.gui.app.security.user.browse.UserBrowser;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.data.GroupDatasource;

import javax.inject.Inject;
import java.util.Map;
import java.util.UUID;

import static com.haulmont.cuba.gui.data.CollectionDatasource.Operation.ADD;
import static com.haulmont.cuba.gui.data.CollectionDatasource.Operation.UPDATE;

public class ExtUserBrowser extends UserBrowser {

    @Inject
    GroupDatasource<ExtUser, UUID> usersDs;


    @Override
    public void init(Map<String, Object> params) {

        usersDs.addCollectionChangeListener(e -> {
            if (e.getOperation() == ADD||e.getOperation()==UPDATE) {


                if(usersDs.getItem().getBuyer()==null){

showOptionDialog("", "Do you wont to create the Buyer?", MessageType.CONFIRMATION,  new Action[]{
                new DialogAction(DialogAction.Type.YES, Action.Status.PRIMARY).withHandler(o ->

                        {}

                        ),
                new DialogAction(DialogAction.Type.NO, Action.Status.NORMAL)
        }
);

                }
            }
        });

    }


}