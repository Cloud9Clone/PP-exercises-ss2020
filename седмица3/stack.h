#include <cassert>
#include <stdexcept>
#include <iostream>


class stack
{
	int *arr;
	int top;
	int capacity;

public:
	stack(int size = 2); 	
	~stack();   				

	void push(int);
	int pop();
	int getTop();

	int size();
	bool isEmpty();
	bool isFull();
	void printStack();
};

// Constructor to initialize stack
stack::stack(int size)
{
	arr = new int[size];
	capacity = size;
	top = -1;
}


stack::~stack()
{
	delete this->arr;
}


void stack::push(int x)
{
	if (isFull())
	{	
		int oldSize=this->size();
		int newSize = oldSize *2;
		this->capacity=newSize+1;
		int* newArray = new int[newSize];
		int* temp = this->arr;

		for (unsigned int i = 0; i < oldSize; ++i){
			newArray[i] = temp[i];
		}
		delete[] this->arr;
		this->arr=newArray;
		this->arr[++top] = x;
		assert(false == isEmpty());
		throw std::overflow_error("OverFlow\nArray size doubled\n");
		
	}else{
	arr[++top] = x;
	//stack is not empty after push operation
    assert(false == isEmpty());
	}

}


int stack::pop()
{
	// check for stack underflow
	if (isEmpty())
	{
		throw std::underflow_error ("UnderFlow\nProgram Terminated\n");
		
	}

	// decrease stack size by 1 and (optionally) return the popped element
	return this->arr[top--];
}


int stack::getTop()
{
	if (!isEmpty())
		return arr[top];
	else
		throw std::underflow_error ("UnderFlow\nProgram Terminated\n");
}


int stack::size()
{
	return top + 1;
}


bool stack::isEmpty()
{
	return top == -1;	// or return size() == 0;
}


bool stack::isFull()
{
	return top == capacity - 1;	
}
void stack:: printStack(){
	for (unsigned int i = 0; i < this->size(); ++i){
			std::cout<<this->arr[i]<<std::endl;
		}

}