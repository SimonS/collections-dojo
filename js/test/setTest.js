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
    assert.equal(3, s.length(), "new set with contents is not empty" );
});

QUnit.test( "add method", function( assert ) {
    var s = new Set();
    s.add(4);
    assert.equal(true, s.contains(4), "new set with contents is not empty" );
});
