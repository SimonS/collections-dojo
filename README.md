collections-dojo
================

# Question 1: Lists

Description: At 6am there are a queue of 100 people waiting in line for a ticket to the Wimbledon 2014 finals between Novak Djokovic & Roger Federer.

Four people join the back of the queue at 6.05am, with another six people pushing into the queue after the 75th person five minutes later. A couple who were having their spaces saved are replaced by the couple (30th in the queue) they were saving a place for another five minutes later at 6.15am. If each person is taking on average 45 seconds to purchase their ticket at what time will the last person in the queue purchase theirs?


> Calculate the answer of this question by using a List. You must implement your own List library to complete this task.

> Print out a string representation of the Wimbledon queue with each person in the queue represented by the time in which they were in the queue (assume everyone who was already in the queue joined at 6am when the ticket booths opened).

## Bonus

Print the list in reverse order

## Things to cover...

   * Infinite list of items
   * Can add to end of list
   * Can insert an element at index i
   * Can replace any element at index i
   * Can get any member of list at index i
   * Can remove any member of a list at index i
   * Iterate through a list
   * Handle out of bound index errors

# Question 2: LinkedList

Implement Question 1 using a linked list as opposed to an array list. Think about how this implementation differs and how it will affect the performance and operation of a Linked list as opposed to an Array List.

When and why might you want to use one over another?

## Bonus

Calculate and compare the performance of your LinkedList implementation in comparison with the ArrayList implementation.

# Question 3: Queue

Imagine you have a list of 10 jobs where the next job to run is the job that was first placed into the queue (uses a First-In First-Out [FIFO] policy). 

Implement a queue class that supports the following operations

   * add - add a job to the start of the queue
   * remove - removes a job from the head/end of the queue
   * element - looks at the head of the queue but does not remove it
   * clear - removes all elements from the queue

# Question 4: Priority Queue

Imagine you have a list of client orders that need processing. Each clients order is given a priority.

Implement the Priority Queue

   * add - inserts element with a set priority into the queue
   * clear - remove all elements from the queue
   * remove - removes single instance of the specified element
      * if there are multiple elements with the same priority the head one is removed
   * poll - retrieves and removes the head of the queue
   * peek - retrieves but doesn’t remove the head of the queue

# Question 5: Set

   * Cannot contain duplicate elements
   * You can add an element to a set
   * You can traverse the set using an iterator
   * You can check if the set contains an element
   * You can check if the set contains all the specified elements
   * You can check if the set is empty
   * You can remove a single element
   * You can remove all elements that are specified in opposing set (relative complement)
   * You can retain only those elements that are shared with another set (intersection)
   * You can join two sets but exclude those elements that are shared (disjoint-union)


# Question 6: Map
