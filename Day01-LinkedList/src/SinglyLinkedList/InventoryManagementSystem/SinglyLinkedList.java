package SinglyLinkedList.InventoryManagementSystem;

public class SinglyLinkedList {
    InventoryNode head;

    // Add an item at the starting.
    public void addAtBeginning(String itemName, int itemId, int quantity, int price){
      InventoryNode newNode = new InventoryNode(itemName, itemId, quantity,price);

      if(head == null){
          head = newNode;
      }
      else{
          newNode.next = head;
          head = newNode;
          System.out.println("Item added at the beginning. ");
      }
    }

    // Add an item at the ending.
    public void addAtEnding(String itemName, int itemId, int quantity, int price){
        InventoryNode newNode = new InventoryNode(itemName, itemId, quantity,price);

        if(head == null){
            head = newNode;
        }
        else {
            InventoryNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        System.out.println("Item added at the ending. ");
    }
    // Add an item at the specific position.
    public void addAtPosition(String itemName, int itemId, int quantity, int price, int position){
        InventoryNode newNode = new InventoryNode(itemName, itemId, quantity,price);

        if(head == null){
            System.out.println("Position out of range.");
            return;
        }
        if(position < 0){
            System.out.println("Invalid position. ");
            return;
        }
        if(position == 1){
            addAtBeginning(itemName, itemId, quantity,price);
        }
        InventoryNode curr = head;
        for(int i = 1; i < position-1; i++){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        System.out.println("Item added at position " + position);
    }
    // Remove an item by itemID.
    public void removeByItemId(int itemID){
        if(head == null){
            System.out.println("Inventory is empty.");
            return;
        }
        if(head.itemId == itemID){
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        InventoryNode curr = head;
        while(curr.next != null && curr.next.itemId != itemID){
            curr = curr.next;
        }
        if(curr.next == null){
            System.out.println("Item not found.");
        }
        else{
            curr.next = curr.next.next;
            System.out.println("Item removed.");
        }

    }
    // Update quantity of an item.
    public void updateQuantity(int itemID, int newQuantity){
        if(head == null){
            System.out.println("Quantity can not be changed.");
            return;
        }

        InventoryNode curr = head;
        while(curr != null){
            if(curr.itemId == itemID){
                curr.quantity = newQuantity;
                System.out.println("Quantity updated.");
                return;
            }
            curr = curr.next;
        }
        System.out.println("Item not found.");

    }

    // Search for an item by item ID.
    public void searchByItemId(int itemID){
        if(head == null){
            System.out.println("Item not found.");
            return;
        }

        InventoryNode curr = head;

        while(curr != null){
            if(curr.itemId == itemID){
                System.out.println("Item found: " + curr.itemName + ", ID: " + curr.itemId + ", Quantity: "
                        + curr.quantity + ", Price: " + curr.price);
                return;
            }
            curr = curr.next;
        }
        System.out.println("Item not found.");

    }

    // Search for an item by item name.
    public void searchByItemName(String itemName){
        if(head == null){
            System.out.println("Item not found.");
            return;
        }

        InventoryNode curr = head;

        while(curr != null){
            if(curr.itemName.equals(itemName)){
                System.out.println("Item found: " + curr.itemName + ", ID: " + curr.itemId + ", Quantity: "
                        + curr.quantity + ", Price: " + curr.price);
                return;
            }
            curr = curr.next;
        }
        System.out.println("Item not found.");

    }

    // Calculate and display the total value of inventory
    public void calculateTotalValue(){
        double totalValue = 0;
        if(head == null){
            System.out.println("Value is 0.");
            return;
        }
        InventoryNode curr = head;
        while(curr != null){
            totalValue += curr.price * curr.quantity;
            curr = curr.next;
        }
        System.out.println("Total inventory value: "+totalValue);
    }

    public void sortByItemName() {
        if (head == null || head.next == null) {
            return; // No need to sort if the list is empty or has only one item
        }

        boolean swapped;
        do {
            swapped = false;
            InventoryNode current = head;
            InventoryNode previous = null;

            while (current.next != null) {
                if (current.itemName.compareTo(current.next.itemName) > 0) {
                    // Swap nodes
                    InventoryNode nextNode = current.next;
                    current.next = nextNode.next;
                    nextNode.next = current;

                    if (previous == null) {
                        head = nextNode; // Update head if swapping the first node
                    } else {
                        previous.next = nextNode;
                    }

                    previous = nextNode;
                    swapped = true;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        } while (swapped);

        System.out.println("Inventory sorted by Item Name (ascending).");
    }

    // Sort the inventory by Price (ascending) using Bubble Sort
    public void sortByPrice(boolean ascending) {
        if (head == null || head.next == null) {
            return; // No need to sort if the list is empty or has only one item
        }

        boolean swapped;
        do {
            swapped = false;
            InventoryNode current = head;
            InventoryNode previous = null;

            while (current.next != null) {
                boolean shouldSwap = ascending ? (current.price > current.next.price) : (current.price < current.next.price);

                if (shouldSwap) {
                    // Swap nodes
                    InventoryNode nextNode = current.next;
                    current.next = nextNode.next;
                    nextNode.next = current;

                    if (previous == null) {
                        head = nextNode; // Update head if swapping the first node
                    } else {
                        previous.next = nextNode;
                    }

                    previous = nextNode;
                    swapped = true;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        } while (swapped);

        System.out.println("Inventory sorted by Price (" + (ascending ? "ascending" : "descending") + ").");
    }

    // Display all items.
    public void displayItems() {
        InventoryNode curr = head;
        while (curr != null) {
            System.out.println("Item: " + curr.itemName + ", ID: " + curr.itemId
                    + ", Quantity: " + curr.quantity + ", Price: " + curr.price);
            curr = curr.next;
        }
    }



}
