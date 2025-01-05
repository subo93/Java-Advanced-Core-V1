package lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TelecomAgentExample {
    public static void main(String[] args) {
    // List of agents
    List<Agent> agents = Arrays.asList(
            new Agent("Alice", "East", 50),
            new Agent("Bob", "West", 30),
            new Agent("Charlie", "East", 70),
            new Agent("David", "North", 40)
    );

// 1. Filter agents from the East region
    List <Agent> eastAgents = agents.stream().filter(agent->agent.region.equals("East")).collect(Collectors.toList());
        System.out.println("Agents from East: " + eastAgents);

      // 2. Sort agents by the number of customers handled
        List<Agent> sortedAgents =  agents.stream().sorted((a1,a2)->Integer.compare(a2.customersHandled,a1.customersHandled))
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sortedAgents);

        // 3. Map agents' names to a simple list
        List<String> agentNames = agents.stream()
                .map(agent -> agent.name)
                .collect(Collectors.toList());
        System.out.println("Agent names: " + agentNames);


}}
