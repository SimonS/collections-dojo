collections-dojo
================

Exercise #1: Lists


Description: At 6am there are a queue of 100 people waiting in line for a ticket to the Wimbledon 2014 finals between Novak Djokovic & Roger Federer.

Another 4 people join the back of the queue at 6.05am, with another 6 people pushing into the queue after the 75th person 5 minutes later. A couple who were having their spaces saved are replaced by the couple they were saving a place for another 5 minutes later at 6.15am. If each person is taking on average 45 seconds to purchase their ticket at what time will the last person in the queue purchase theirs?

Calculate the answer of this question by using a List. You must implement your own List library to complete this task.

Print out a string representation of the Wimbledon queue with each person in the queue represented by the time in which they were in the queue (assume everyone who was already in the queue joined at 6am when the ticket booths opened).

Print the list in reverse order


   * Infinite list of items
   * Can add to end of list
   * Can insert an element at index i
   * Can replace any element at index i
   * Can get any member of list at index i
   * Can remove any member of a list at index i
   * Iterate through a list
   * Handle out of bound index errors


Exercise #2: Queue

Imagine you have a list of 10 jobs where the next job to run is the job that was first placed into the queue (uses a First-In First-Out [FIFO] policy). 

Implement a queue class that supports the following operations


   * add - add a job to the start of the queue
   * remove - removes a job from the head/end of the queue
   * element - looks at the head of the queue but does not remove it
   * clear - removes all elements from the queue

Exercise #2b: Priority Queue 

Imagine you have a list of client orders that need processing. Each clients order is given a priority.

Implement the Priority Queue


   * add - inserts element with a set priority into the queue
   * clear - remove all elements from the queue
   * remove - removes single instance of the specified element
      * if there are multiple elements with the same priority the head one is removed
   * poll - retrieves and removes the head of the queue
   * peek - retrieves but doesn’t remove the head of the queue

Exercise #3: Set


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


Exercise #4: Map


   * Contains key-value mapping



Bonus:
Implement a sorting algorithm on a collection of your choice
