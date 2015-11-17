/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.outlook.fetchers;

import com.microsoft.services.outlook.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  MailFolder
 */
public class MailFolderFetcher extends OrcEntityFetcher<MailFolder,MailFolderOperations> 
                                     implements Readable<MailFolder> {

     /**
     * Instantiates a new MailFolderFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public MailFolderFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, MailFolder.class, MailFolderOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public MailFolderFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }
	
	/**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public MailFolderFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    
     /**
     * Gets messages.
     *
     * @return the messages
     */
    public OrcCollectionFetcher<Message, MessageFetcher, MessageCollectionOperations> getMessages() {
        return new OrcCollectionFetcher<Message, MessageFetcher, MessageCollectionOperations>("Messages", this, Message.class, MessageCollectionOperations.class);
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public MessageFetcher getMessage(String id){
         return new OrcCollectionFetcher<Message, MessageFetcher, MessageCollectionOperations>("Messages", this, Message.class, MessageCollectionOperations.class).getById(id);
    }

     /**
     * Gets child folders.
     *
     * @return the child folders
     */
    public OrcCollectionFetcher<MailFolder, MailFolderFetcher, MailFolderCollectionOperations> getChildFolders() {
        return new OrcCollectionFetcher<MailFolder, MailFolderFetcher, MailFolderCollectionOperations>("ChildFolders", this, MailFolder.class, MailFolderCollectionOperations.class);
    }

    /**
     * Gets child folder.
     *
     * @return the child folder
     */
    public MailFolderFetcher getChildFolder(String id){
         return new OrcCollectionFetcher<MailFolder, MailFolderFetcher, MailFolderCollectionOperations>("ChildFolders", this, MailFolder.class, MailFolderCollectionOperations.class).getById(id);
    }

}
