QUnit.test( "empty set", function( assert ) {
    var s = new Set();
    assert.ok(s.isEmpty(), "new set is empty" );
});

QUnit.test( "empty set returns false when initialised with contents", function( assert ) {
    var s = new Set(1, 3, 4);
    assert.ok(!s.isEmpty(), "new set with contents is not empty" );
});

QUnit.test( "test for membership", function( assert ) {
    var s = new Set(1, 3, 4);
    assert.ok(s.contains(3));
    assert.ok(!s.contains(7));
});

QUnit.test( "removes duplicates", function( assert ) {
    var s = new Set(1, 3, 1, 4);
    assert.equal(3, s.length());
});

QUnit.test( "add method", function( assert ) {
    var s = new Set();
    s.add(4);
    assert.equal(true, s.contains(4));
});

QUnit.test( "test iteration", function( assert ) {
    var s = new Set(1, 2, 3);
    var result = "";
    s.forEach(function(val, index) {
        result += index + '' + val; 
    });
    assert.equal("011223", result, "new set with contents is not empty" );
});

QUnit.test("test all", function(assert) {
    var s = new Set(1, 2, 3);
    assert.ok(s.all(1, 3));
});

QUnit.test("test remove", function(assert) {
    var s = new Set(1, 2, 3);
    s.remove(2);
    assert.ok(!s.contains(2));
    assert.equal(2, s.length());
});

QUnit.test("test union", function(assert) {
    var s = new Set(1, 2);
    var t = new Set(2, 3);
    s = s.union(t);
    assert.ok(s.contains(1));
    assert.ok(s.contains(2));
    assert.ok(s.contains(3));
});

QUnit.test("test intersection", function(assert) {
    var s = new Set(1, 2, 3);
    var t = new Set(2, 3, 4);
    s = s.intersection(t);
    assert.ok(s.contains(2));
    assert.ok(s.contains(3));
});

QUnit.test("test difference", function(assert) {
    var s = new Set(1, 2, 3, 4);
    var t = new Set(2, 3);
    s = s.difference(t);
    assert.ok(s.contains(1));
    assert.ok(s.contains(4));
    assert.equal(2, s.length());
});
