package ru.job4j.collection.job;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameDecreaseAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDecrease().thenComparing(new JobDescByPriorityDecrease());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityIncrease() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDecrease().thenComparing(new JobDescByPriorityIncrease());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameIncreaseAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByNameIncrease().thenComparing(new JobDescByPriorityDecrease());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityDecrease() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDecrease().thenComparing(new JobDescByPriorityDecrease());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}