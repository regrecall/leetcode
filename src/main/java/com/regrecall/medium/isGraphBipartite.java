package com.regrecall.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xingchi.wxc
 * @version : isGraphBipartite.java, v 0.1 2019年09月18日 14:36 regrecall Exp $
 */
public class isGraphBipartite {

    public static boolean isBipartite(int[][] graph) {
        int[] map = new int[100];
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < graph.length;i++){
            if(map[i]!=0)
                continue;
            queue.offer(i);
            map[i] = 1;
            while(!queue.isEmpty()){
                int cur = queue.poll();
                int[] neighbors = graph[cur];
                for(int j : neighbors){
                    if(map[j] == 0){
                        queue.offer(j);
                        map[j] = -map[cur];
                    }
                    else{
                        if(map[j] == map[cur])
                            return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {{1}, {0}, {4}, {4}, {2, 3}};
        System.out.println(isBipartite(graph));

    }
}