package com.github.hexosse.pluginframework.pluginapi.message;

/*
 * Copyright 2016 hexosse
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import com.google.common.collect.Lists;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * @author <b>hexosse</b> (<a href="https://github.comp/hexosse">hexosse on GitHub</a>))
 */
public class MessageTarget
{
    private List<CommandSender> targets;

    public MessageTarget() {
        this.targets = Lists.newArrayList();
    }

    public MessageTarget(List<CommandSender> targets) {
        this.targets = targets;
    }

    public MessageTarget(CommandSender... commandSender) {
        this.targets = Lists.newArrayList(commandSender);
    }

    public MessageTarget(CommandSender commandSender) {
        this.targets = Lists.newArrayList(commandSender);
    }

    public void add(CommandSender commandSender) {
		if(commandSender!=null)
			this.targets.add(commandSender);
    }

    public List<CommandSender> getTargets() {
        return targets;
    }
}
