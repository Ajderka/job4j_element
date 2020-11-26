package ru.job4j.collection.job;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Reboot server", 1),
                new Job("Impl task", 2)
        );
        System.out.println(jobs);
        Comparator<Job> combine = new JobDescByNameIncrease()
                .thenComparing(new JobDescByPriorityDecrease())
                .thenComparing(new JobDescByNameLn());
        Collections.sort(jobs, combine);
        System.out.println(jobs);
    }
}