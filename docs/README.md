# User Guide

Duke: Power Hour is a simple GUI-based application that helps the productive user manage and track tasks.

## Features 

### Simple GUI interactions

Fuss-free usage of the application. Enter a simple command and see responses instantly.

### Multiple task types

Three task types - Todo, Deadline and Event enable you to manage a plethora of tasks.

### Various task management features

Add, delete, view, find, sort and mark tasks as required.

### Save and load feature

The state of tasks will be saved to disk after the application is closed, allowing for task retention between sessions.

## Command summary
- `todo <task name>`
- `deadline <task name> /by <date and time>`
- `event <task name> /at <date and time>`
- `mark <task number>`
- `unmark <task number>`
- `list`
- `delete <task number>`
- `find <search term>`
- `sortname`
- `sortdate`
- `bye`

## Usage

### `todo <task name>` - Add a Todo task

Adds a Todo type task with the specified name to the task list.
Todo tasks have no associated date or time.

Example of usage: 

`todo example task`

Expected outcome:

![](./example_todo.png)

### `deadline <task name> /by <date and time>` - Add a Deadline task

Adds a Deadline type task with the specified name, date and time to the task list.
Date and time must be entered in the format `dd-MM-yyyy-HH-mm`.

Example of usage: 

`deadline create task /by 15-09-2022-16-30`

Expected outcome:

![](./example_deadline.png)

### `event <task name> /at <date and time>` - Add an Event task

Adds an Event type task with the specified name, date and time to the task list.
Date and time must be entered in the format `dd-MM-yyyy-HH-mm`.

Example of usage: 

`event team meeting /at 17-10-2022-20-30`

Expected outcome:

![](./example_event.png)

### `mark <task number>` - Mark a task as done

Marks a task specified by its index number as done, which is represented by a checked box in the task name.

Example of usage: 

`mark 2`

Expected outcome:

![](./example_mark.png)

### `unmark <task number>` - Unmark a task

Unmarks a task specified by its index number as not done, which is represented by a blank box in the task name.

Example of usage: 

`unmark 2`

Expected outcome:

![](./example_unmark.png)

### `list` - List all tasks

Displays all task in their current states and order.

Example of usage: 

`list`

Expected outcome:

![](./example_list.png)

### `delete <task number>` - Delete a task

Deletes a task specified by its index number.

Example of usage: 

`delete 1`

Expected outcome:

![](./example_delete.png)

### `find <search term>` - Find all tasks containing search term

Lists tasks in the task list whose task names contain the specified search term.

Example of usage: 

`find tas`

Expected outcome:

![](./example_find.png)

### `sortname` - Sorts tasks by name

Sorts tasks in the task list by name, arranged in ascending order. Task order is permanently changed. To see the newly sorted tasks, call the 'list' command.

Example of usage: 

`sortname`
`list`

Expected outcome:

![](./example_sortname.png)

### `sortdate` - Sorts tasks by date

Sorts tasks in the task list by date, then time, arranged in ascending order. Task order is permanently changed. To see the newly sorted tasks, call the 'list' command.

Example of usage: 

`sortdate`
`list`

Expected outcome:

![](./example_sortdate.png)

### `bye` - Exits the application

Closes the application after a short pause and greeting.

Example of usage: 

`bye`

Expected outcome:

![](./example_bye.png)
