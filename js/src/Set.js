function Set() {
    this.set = Array.prototype.slice.call(arguments);
};

Set.prototype.isEmpty = function() {
    return this.set.length === 0;
};
